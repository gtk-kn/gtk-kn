FROM opensuse/tumbleweed

LABEL maintainer="leinardi@gmail.com"
LABEL version="0.1"
LABEL description="This is a custom openSUSE Tumbleweed Docker Image for gtk-kn."

WORKDIR /app

COPY docker/opensuse-tumbleweed/install-opensuse-tumbleweed-deps.sh /app/

# Make sure the script is executable and run it
RUN zypper -n update && \
    /app/install-opensuse-tumbleweed-deps.sh && \
    rm -rf /var/cache/zypper
