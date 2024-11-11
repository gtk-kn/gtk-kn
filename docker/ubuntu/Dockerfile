FROM ubuntu:24.04

LABEL maintainer="leinardi@gmail.com"
LABEL version="0.1"
LABEL description="This is a custom Ubuntu 24.04 Docker Image for gtk-kn."

ARG DEBIAN_FRONTEND=noninteractive

WORKDIR /app

COPY docker/ubuntu/install-ubuntu-deps.sh /app/

RUN apt-get update && \
    apt-get upgrade -y && \
    /app/install-ubuntu-deps.sh && \
    rm -rf /var/lib/apt/lists/*
