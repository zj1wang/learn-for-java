##方式
- 使用yml改
- 编写自定义configration 编写自定义bean，替换（原生是条件装配的）或者添加原生的bean
- 最常用：：web应用最常用，编写配置类，实现WebMvcConfigurer，重写函数，实现定制化+@Bean给容器中添加写组件