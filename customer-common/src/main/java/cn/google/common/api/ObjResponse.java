package cn.google.common.api;

import cn.google.common.api.BaseResponse;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ObjResponse<T> extends BaseResponse {
    T item;//对象的返回结果


}
