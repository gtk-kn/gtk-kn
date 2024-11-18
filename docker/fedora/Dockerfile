FROM fedora:41

LABEL maintainer="leinardi@gmail.com"
LABEL version="0.1"
LABEL description="This is a custom Fedora 41 Docker Image for gtk-kn."

# Add build arguments for the user and group IDs
ARG UID=1000
ARG GID=1000

# Create the group and user
RUN groupadd -g ${GID} developer && \
    useradd -m -u ${UID} -g developer developer

USER root

COPY docker/fedora/install-fedora-deps.sh /tmp

RUN dnf -y update && \
    /tmp/install-fedora-deps.sh && \
    dnf clean all && \
    rm -rf /var/cache/dnf

# Switch to the non-root user
USER developer

WORKDIR /home/developer
