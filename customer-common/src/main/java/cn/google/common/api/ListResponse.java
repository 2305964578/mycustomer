package cn.google.common.api;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ListResponse<T> extends BaseResponse {
    List<T> list;//list的返回结果


}
