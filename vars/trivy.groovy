def trivyScan(String scanType, String target, String outputFile) {

    echo "Running Trivy ${scanType} scan on ${target}"

    sh """
        trivy ${scanType} ${target} \
        --severity HIGH,CRITICAL \
        --format table \
        --output ${outputFile}
    """

    echo "Trivy scan completed. Report saved at ${outputFile}"
}
