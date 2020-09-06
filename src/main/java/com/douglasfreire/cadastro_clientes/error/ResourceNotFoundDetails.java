package com.douglasfreire.cadastro_clientes.error;

public class ResourceNotFoundDetails extends ErrorDetail{

    public static final class ResourceNotFoundDetailsBuilder {
        private String title;
        private int status;
        private String detail;
        private Long timestamp;
        private String developerMessage;

        ResourceNotFoundDetailsBuilder() {
        }

        public static ResourceNotFoundDetailsBuilder newBuilder() {
            return new ResourceNotFoundDetailsBuilder();
        }

        public ResourceNotFoundDetailsBuilder title(String title) {
            this.title = title;
            return this;
        }

        public ResourceNotFoundDetailsBuilder status(int status) {
            this.status = status;
            return this;
        }

        public ResourceNotFoundDetailsBuilder detail(String detail) {
            this.detail = detail;
            return this;
        }

        public ResourceNotFoundDetailsBuilder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public ResourceNotFoundDetailsBuilder developerMessage(String developerMessage) {
            this.developerMessage = developerMessage;
            return this;
        }

        public ResourceNotFoundDetails build() {
            ResourceNotFoundDetails resourceNotFoundDetails = new ResourceNotFoundDetails();
            resourceNotFoundDetails.setTimestamp(timestamp);
            resourceNotFoundDetails.setDeveloperMessage(developerMessage);
            resourceNotFoundDetails.setStatus(status);
            resourceNotFoundDetails.setDetail(detail);
            resourceNotFoundDetails.setTitle(title);
            return resourceNotFoundDetails;
        }
    }
}
