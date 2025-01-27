FROM fedora:41

LABEL maintainer="leinardi@gmail.com"
LABEL version="0.1"
LABEL description="This is a custom Fedora 41 Docker Image for gtk-kn."

# Build arguments for UID and GID
ARG UID=0
ARG GID=0
ARG DEFAULT_USER="root"

# Conditional creation of the developer user
RUN if [ "${UID}" -ne 0 ] && [ "${GID}" -ne 0 ]; then \
      groupadd -g ${GID} developer && \
      useradd -m -u ${UID} -g developer developer && \
      mkdir -p /home/developer && \
      chown -R developer:developer /home/developer && \
      DEFAULT_USER="developer"; \
    fi; \
    echo "Default user set to: ${DEFAULT_USER}"

WORKDIR /app

COPY docker/fedora/install-fedora-deps.sh /app/

RUN dnf -y update && \
    /app/install-fedora-deps.sh && \
    dnf clean all && \
    rm -rf /var/cache/dnf

# Set the default user
USER ${DEFAULT_USER}
