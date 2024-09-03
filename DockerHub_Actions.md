- [link1](https://docs.docker.com/build/ci/github-actions/)
- [link2](https://github.com/docker/login-action)
#### Steps to build image and push to DockerHub using GithubActions
1. Create a new GitHub repository using [template rep](https://github.com/new?template_name=clockbox&template_owner=dvdksn) that contain **Dockerfile**.
2. Open DockerHub repo 
    - DOCKERHUB_USERNAME: dkutti
    - DOCKERHUB_TOKEN: Account settings-- Security-- PAT -- Generate new token -- give description and access permissions.
3. Open the repository Settings, and go to Secrets and variables > Actions
    - Create a new Repository secret `DOCKERHUB_USERNAME` and `DOCKERHUB_TOKEN`