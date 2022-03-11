# WebPos

在 poshell 的基础上升级为使用 MVC 架构的 web 服务，实现了包括商品的添加，购物车的编辑，价格（含税与折扣等）的计算，税率与折扣等定义在 application.yml 中，避免在代码中硬编码

## 视图层

view 使用 thymeleaf 的模板实现，controller 会将数据填充到模板，然后交由模板引擎渲染为静态页面

## 控制层

控制层定义 controller 类，用于将路径映射到特定的处理方法，除此之外也实现了 service 层作为控制层的一部分，目的是将业务逻辑和路由相关的逻辑解耦，避免 controller 代码规模过大

## 模型层

模型层沿用 poshell 的代码，使用 h2 database 结合 spring data jpa 访问数据，service 层控制数据的访问，controller 调用 service 的方法进行业务逻辑的控制