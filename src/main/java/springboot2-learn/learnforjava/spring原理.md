#对spring的深入理解
## start
start包依赖configration包，configration有一个autoconfigration类，会实现条件装载，（spring启动时会检测factorty文件中要加载哪些configration）
** 所以 My-auto0configration ** 中必须有imf的congfigtion，具体见项目
## springboot原理
- run后，准备应用，从spring.factoryies加载各种东西到Application，包括autoconfigration，启动listener等等
- 启动应用：创建上下文，IOC容器等，加载bean到IOC容器
- 启动成功