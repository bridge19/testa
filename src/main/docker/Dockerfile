# Version 0.0.1
FROM java:8

MAINTAINER Ryuu KK "ryuu_kk@163.com"

# 鐜鍙橀噺
ENV WORK_PATH /home/project/dockerdemo
ENV APP_NAME @project.build.finalName@.@project.packaging@
ENV APP_VERSION @project.version@

EXPOSE 8080

#USER
#USER user:group

#VOLUME
VOLUME ["/home/project", "/tmp/data"]

#ADD

#COPY
COPY $APP_NAME $WORK_PATH/

#LABEL
#STOPSIGNAL
#ARG
#ONBUILD

# WORKDIR
WORKDIR $WORK_PATH

