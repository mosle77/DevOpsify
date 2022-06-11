package com.winchesters.devopsify.service.technologies.jenkins;

import com.cdancy.jenkins.rest.domain.user.ApiTokenData;
import com.winchesters.devopsify.exception.jenkins.JenkinsException;
import com.winchesters.devopsify.model.JenkinsAnalyseResults;
import com.winchesters.devopsify.model.entity.Project;
import com.winchesters.devopsify.model.entity.Server;

import java.io.File;

public interface JenkinsService {

    void generateJenkinsFile(File directory);

    void pingJenkinsServer() throws JenkinsException;

    void pingJenkinsServer(Server server) throws JenkinsException;

    void setJenkinsClient(Server server);

    void installRequiredPlugins();

    void saveGithubCredentials(String token);

    void pullFromGithub();

    void createGithubTrigger();

    ApiTokenData createApiToken();
    void createPipeline(String repositoryUrl);

    JenkinsAnalyseResults analyseJenkins(Project project);

}
