package com.winchesters.devopsify.service.technologies.github;

import com.winchesters.devopsify.dto.request.GithubRepositoryDto;
import org.kohsuke.github.GHRepository;

import java.io.IOException;

public interface GithubRepositoryService {
    /**
     *  create a new repository in github
     * @param githubRepositoryDto an object containing name, owner, autoInit, licenseTemplate, gitIgnoreTemplate attributes
     * @throws IOException : connection problems
     * @return the created repository
     */
    GHRepository createRepository(GithubRepositoryDto githubRepositoryDto
    ) throws IOException;
}