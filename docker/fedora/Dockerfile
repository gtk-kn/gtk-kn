FROM fedora:41

LABEL maintainer="leinardi@gmail.com"
LABEL version="0.1"
LABEL description="This is a custom Fedora 41 Docker Image for gtk-kn."

WORKDIR /app

COPY docker/fedora/install-fedora-deps.sh /app/

RUN dnf -y update && \
    /app/install-fedora-deps.sh && \
    dnf clean all && \
    rm -rf /var/cache/dnf
