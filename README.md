# GitHub-Actions-Zero-to-Hero
Repository to kick start your journey with GitHub Actions

## Comparing with Jenkins 

### Advantages of GitHub Actions over Jenkins

- Hosting: Jenkins is self-hosted, meaning it requires its own server to run, while GitHub Actions is hosted by GitHub and runs directly in your GitHub repository.

- User interface: Jenkins has a complex and sophisticated user interface, while GitHub Actions has a more streamlined and user-friendly interface that is better suited for simple to moderate automation tasks.

- Cost: Jenkins can be expensive to run and maintain, especially for organizations with large and complex automation needs. GitHub Actions, on the other hand, is free for open-source projects and has a tiered pricing model for private repositories, making it more accessible to smaller organizations and individual developers.

### Advantages of Jenkins over GitHub Actions

- Integration: Jenkins can integrate with a wide range of tools and services, but GitHub Actions is tightly integrated with the GitHub platform, making it easier to automate tasks related to your GitHub workflow.

In conclusion, Jenkins is better suited for complex and large-scale automation tasks, while GitHub Actions is a more cost-effective and user-friendly solution for simple to moderate automation needs.


#### Related links
- [link](https://docs.github.com/en/actions) open Use cases and examples, Build and test
- Task1: Create a python build an test python file create an venv and install the requrired libraries and store it in requirement.txt file and push it into github remote repository and pull it in your local repository.
####  `.github/workflows` in the root repository Using a Python workflow template.
- Click on Action.
- Clik on new work flow
- Choose `python application`
#### PAT Generation
- Right side you can see the Account holder
- click on settings.
- Left side you can see developer settings click on it
- Click on Personal access tokens select `Tokens (Classic)` click on generate new token classic
- Use pass key if required and give name select the scope atleast repo.

#### [adding secrets to the github Action](https://docs.github.com/en/actions/security-for-github-actions/security-guides/using-secrets-in-github-actions)
- Go to your project in Github
- Select the Settings tab
- Click the Security section and secrets and variables select Actions
- Add a new secret in repository with name `PUSHPAT` and value `PAT`

#### [remote: Permission to git denied to github-actions[bot]](https://github.com/ad-m/github-push-action/issues/96)
- Open GitHub Repository where the problem is occurring.
- Go to Settings.
- Go to Actions.
- Go to General.
- Scroll down to Workflow permissions.
- Make sure the following settings are enabled and click "Save"

#### update .gitignore file
- as iam creating virtual environment myenv/ i added it to .gitignore file


