function errorr() {
    throw  new error("Esto está mal");
}
try {
    showError();
} catch (e) {
    logger.log("error", e.toString());
}