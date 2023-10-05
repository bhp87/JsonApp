package org.bhp.first_extreceice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DummyPostsJsonDto extends BaseJsonDto {
    List<String> tags;
    Long reactions;

}
