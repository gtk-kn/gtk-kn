# Docker Images

This repository contains Dockerfiles and scripts to build and run the Docker images used by gtk-kn CI.

## Build and Run Instructions

### Build an Image

Navigate to the directory containing the desired `Dockerfile` and run:

```bash
docker build -t <image-name> <path to the Dockerfile> .
```

Example for Fedora:

```bash
docker build -t fedora -f docker/fedora/Dockerfile .
```

### Run a Container

Start a container from the built image and open a bash shell:

```bash
docker run -it <image-name> /bin/bash
```

Example for Fedora:

```bash
docker run -it fedora /bin/bash
```

## Cleanup Commands

### Prune Everything

Remove all unused containers, networks, images, volumes, and build caches:

```bash
docker system prune -a --volumes
```

⚠️ **Warning**: This command is destructive and will remove all resources not actively in use.

### Remove Unused or Dangling Images

Remove all dangling or unused images:

```bash
docker image prune -a
```

- `-a`: Ensures all unused images are removed, not just dangling ones.
