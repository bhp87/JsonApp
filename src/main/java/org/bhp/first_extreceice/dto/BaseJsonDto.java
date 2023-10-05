package org.bhp.first_extreceice.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseJsonDto {
    Long userId;
    Long id;
    String title;
    String body;

}
