# father-master分支
说明：本工程是一个intellij idea多模块工程的整合模板，直接打包父工程即可将所有的工程依赖包和工程本身打包成一个jar包，部署到生产，参考博客：https://blog.csdn.net/baidu_41885330/article/details/81875395

        工程结构：
                 父工程father

                                       子模块  dao      （用于持久化数据跟数据库交互）

                                       子模块  entity    （实体类）

                                       子模块  service （处理业务逻辑）

                                       子模块  web       （页面交互接收、传递数据，唯一有启动类的模块）

                    关系：         web依赖 service、dao、entity

                                        service依赖 dao、entity

                                        dao依赖 entity

                                        entity谁都不依赖，独立的
                                        
                                        
# father-logbak分支
说明：该分支集成了logback,将项目运行产生的日志分类存储。dev环境下：将trace级别及以上的日志输出到控制台；prod环境下：将info级别及以上的日志分别存到info，warn，error日志文件。项目中的logback-spring.xml文件是个模板，其他项目可直接复制运用。参考博客：https://www.jianshu.com/p/360a0bf06e52
