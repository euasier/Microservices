sudo docker run -p 8081:8081 --network asienets --env JAVA_OPTS="-DEUREKA_SERVER=http://eurekaserver:8761/eureka -DCONFIG_SERVER=http://configserver:8888" micros1-mvc
