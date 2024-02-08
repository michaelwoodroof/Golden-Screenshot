# Golden Screenshot

This repository contains code to run and perform golden screenshots utilising [Paparazzi](https://github.com/cashapp/paparazzi)

## Set-up steps

In order to run this project you will need to run the following commands

```YAML annotate
# Runs tests and generates an HTML report at app/build/reports/paparazzi/ showing all test runs and snapshots.
./gradlew app:testDebug
```

```YAML annotate
# Saves snapshots as golden values to a predefined source-controlled location (defaults to src/test/snapshots).
./gradlew app:recordPaparazziDebug
```

```YAML annotate
# Runs tests and verifies against previously-recorded golden values. Failures generate diffs at sample/build/paparazzi/failures.
./gradlew app:verifyPaparazziDebug
```

```YAML annotate
# Installs Git LFS to project required to track the snapshots images taken
git lfs install --local
```

```YAML annotate
# Installs Git LFS to project required to track the snapshots images taken
git lfs install --local

# Tracks all snapshots to Git LFS
git lfs track "**/snapshots/**/*.png"

# Adds tracking to .gitattributes
git add .gitattributes
```
