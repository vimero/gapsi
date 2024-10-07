# gapsi

#### Deploying a Cloud Run service

1. Set Project Id:
    ```bash
    export GOOGLE_CLOUD_PROJECT=<GCP_PROJECT_ID>
    ```

1. Enable the Artifact Registry API:
    ```bash
    gcloud services enable artifactregistry.googleapis.com
    ```

1. Create an Artifact Registry repo:
    ```bash
    export REPOSITORY="images"
    export REGION=us-central1
    gcloud artifacts repositories create $REPOSITORY --location $REGION --repository-format "docker"
    ```

1. Use the gcloud credential helper to authorize Docker to push to your Artifact Registry:
    ```bash
    gcloud auth configure-docker
    ```

1. Build the container:
    ```bash
    mvn clean compile jib:build -Dimage=$REGION-docker.pkg.dev/$GOOGLE_CLOUD_PROJECT/$REPOSITORY/us-product
    ```

1. Deploy to Cloud Run:
    ```bash
    gcloud run deploy microservice-template \
      --image $REGION-docker.pkg.dev/$GOOGLE_CLOUD_PROJECT/$REPOSITORY/us-product \
      --region $REGION
    ```
