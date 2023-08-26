package com.iremnazyolcu.bean;

import com.iremnazyolcu.data.entity.BlogEntity;
import com.iremnazyolcu.data.entity.CategoryEntity;
import com.iremnazyolcu.data.repository.IBlogRepository;
import com.iremnazyolcu.data.repository.ICategoryRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Lombok
@RequiredArgsConstructor

@Configuration
// Lombok kütüphanesine gelen loglama için kullanacağımız bir yapı: @Log4j2
@Log4j2
@Component
public class CommandLineRunnerBean {

    // sistem publish olduğunda otomatik olarak oluşturmak istediğimiz yapılar burada yazılıyor

    // Injection
    // sistem publish olduğu zaman gitsin default bir tane Blog ve Category oluştursun anlamında
    private final IBlogRepository iBlogRepository;
    private final ICategoryRepository iCategoryRepository;
    private final ModelMapperBean modelMapperBean;

    // bu işlemler aslında Service'te yapılacak ancak bu proje publish olur olmaz CategoryEntity'nin oluşması için
    // category Save
    public CategoryEntity categoryEntitySave(String categoryName) {
        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setCategoryName(categoryName);
        iCategoryRepository.save(categoryEntity);
        return categoryEntity;
    }

    // Kullanıcıdan aldığım verileri database kaydetsin
    public void userData() {
        for (int i = 1; i <= 3; i++) {
            //String user= JOptionPane.showInputDialog(i+".ci Kategori Lütfen Kategori adını yazınız ");
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n");
            System.out.println(i + ".ci Kategori Lütfen Kategori adını yazınız");
            String userName = scanner.nextLine().toUpperCase();
            categoryEntitySave(userName);
        }
    }

    // Kategori Listesini göstermek için :
    public Iterable<CategoryEntity> categoryEntitiesList() {
        return iCategoryRepository.findAll();
    }

    //
    @Bean
    @Transactional // save, delete, update
    public void blogCategorySave() {
        // Kategory oluştursun ve listelesin
        userData();
        Iterable<CategoryEntity> categoryListIterable = categoryEntitiesList();
        List<CategoryEntity> categoryEntityList = new ArrayList<>();
        categoryListIterable.forEach(categoryEntityList::add);

        // Blog oluşturmak (1)
        BlogEntity blogEntity1 = new BlogEntity();
        blogEntity1.getBlogEntityEmbeddable().setHeader("header-1");
        blogEntity1.getBlogEntityEmbeddable().setContent("içerik-1");
        if (categoryEntityList != null) {
            blogEntity1.setRelationCategoryEntity(categoryEntityList.get(0)); //ilk kategoriyi
            iBlogRepository.save(blogEntity1);
        }


        // Blog oluşturmak (2)
        BlogEntity blogEntity2 = new BlogEntity();
        blogEntity2.getBlogEntityEmbeddable().setHeader("header-2");
        blogEntity2.getBlogEntityEmbeddable().setContent("içerik-2");
        if (categoryEntityList != null) {
            blogEntity2.setRelationCategoryEntity(categoryEntityList.get(1)); //ilk kategoriyi
            iBlogRepository.save(blogEntity2);
        }

        // BlogListesi
        categoryEntityList.forEach(System.out::println);
        System.out.println(blogEntity1);
        System.out.println(blogEntity2);
    }

    public CommandLineRunner commandLineRunnerMethod() {
        return args -> {
            // bazen programın başındayken verilerin otomatik olarak oluşmasını istiyorsak bu yapıyı kullanıyoruz:
            // sout'da kesinlikle kullanılabilir
            // log.info sadece daha güzel gösteriyor
            log.info("Data set has been created.");

        }; //end return
    } //end CommandLineRunnerMethod
} // end class