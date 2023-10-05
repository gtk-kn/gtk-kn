FROM archlinux:latest

LABEL maintainer="leinardi@gmail.com"
LABEL version="0.1"
LABEL description="This is a custom Arch Linux Docker Image for gtk-kn."

WORKDIR /app

COPY docker/archlinux/install-archlinux-deps.sh /app/

RUN /app/install-archlinux-deps.sh && \
    rm -rf /var/cache/pacman/pkg/*
