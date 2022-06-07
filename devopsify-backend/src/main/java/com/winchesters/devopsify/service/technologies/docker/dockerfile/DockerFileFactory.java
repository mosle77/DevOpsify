package com.winchesters.devopsify.service.technologies.docker.dockerfile;

import java.io.File;
import java.io.IOException;

public interface DockerFileFactory {
    String DEFAULT_IMAGE_NAME = "SCRATCH";
    String DEFAULT_IMAGE_VERSION = "latest";
    String DEFAULT_IMAGE_BASE_OS = "alpine";

    void writeDockerfile();
    String getDockerfileContent() throws IOException;
    File getDockerfileTemplate();
}
