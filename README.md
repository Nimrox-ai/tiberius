# Tiberius

<a alt="Nx logo" href="https://nx.dev" target="_blank" rel="noreferrer"><img src="https://raw.githubusercontent.com/nrwl/nx/master/images/nx-logo.png" width="45"></a>

Welcome to Tiberius, the mono repo for  Nimrox management.

# Getting Started
## Prerequisites
Install NVM (node version manager) if not installed.
```bash
curl -o- https://raw.githubusercontent.com/nvm-sh/nvm/v0.40.1/install.sh | bash
```

Get the code base
```bash
git clone git@github.com:Nimrox-ai/tiberius.git
cd tiberius  # Very important - we assume are in this folder from now on
```

**==> 🚀🚀🚀 All the rest of the instructions assume you are in the tiberius folder. <==**

Install needed VSCode extensions:
```bash
cat .vscode/extensions.json | jq -r '.recommendations[]' | xargs -n 1 code --install-extension
```

Set git config:
```bash
git config --global pull.rebase true
git config user.name "Your Name"
git config user.email "your.name@nimrox.ai"
```

Install Python:
```bash
brew install pyenv
brew install pyenv-virtualenv
export PATH="$HOME/.pyenv/bin:$PATH"
eval "$(pyenv init -)"
eval "$(pyenv virtualenv-init -)"
pyenv install 3.12.3
```

Install node modules
```bash
npm install
npm run prepare  # Initializes husky hooks
```

🚀 Congratulations, you are now ready to develop!