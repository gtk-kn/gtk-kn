FROM quay.io/gnome_infrastructure/gnome-build-meta:sdk-nightly

LABEL maintainer="leinardi@gmail.com"
LABEL version="0.1"
LABEL description="This is a custom GNOME OS Docker Image for gtk-kn."

ARG jdk_version=17
ARG jdk_arch=x64
ARG jdk_platform=linux

WORKDIR /app

COPY docker/gnome-os/install_jdk.sh /app/

# Download and install OpenJDK 17
RUN /app/install_jdk.sh ${jdk_version} ${jdk_arch} ${jdk_platform}

# Set environment variables
ENV JAVA_HOME /opt/java/jdk-${jdk_version}
ENV PATH $PATH:$JAVA_HOME/bin

# Check installation
RUN java -version
