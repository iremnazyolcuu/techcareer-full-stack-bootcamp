package com.iremnazyolcu.business.dto;

import com.iremnazyolcu.auditing.AuditingAwareBaseDto;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.io.Serializable;

// LOMBOK
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
// Category (1) - Blog (N)
public class CategoryDto extends AuditingAwareBaseDto implements Serializable {

    // Serialization
    public static final Long serialVersionUID = 1L;

    // CategoryDto attributes:

    // CATEGORY
    @NotEmpty(message = "{blog.category.validation.constraints.NotNull.message}")
    @Size(min = 10, message = "{blog.category.least.validation.constraints.NotNull.message}")
    private String categoryName;

}
