package learn.learnforjava;

import lombok.*;

@Getter
@Setter
//
@EqualsAndHashCode
//无参
@NoArgsConstructor
//配合nonnull
@RequiredArgsConstructor
//全参数
@AllArgsConstructor

@Data
//@Data是一个集合体。包含Getter,Setter,RequiredArgsConstructor,ToString,EqualsAndHashCode

@Builder

public class learnLombok {
    //lombok是一个编译级别的插件
    //生成代码
    @NonNull
    private int i;
    private String ii;
}
