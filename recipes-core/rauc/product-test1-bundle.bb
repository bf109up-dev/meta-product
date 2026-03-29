SUMMARY = "RAUC update bundle for product-test1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit bundle

RAUC_BUNDLE_COMPATIBLE = "product-test1"
RAUC_BUNDLE_VERSION = "1.0-${DATETIME}"
RAUC_BUNDLE_DESCRIPTION = "product-test1 firmware update"

RAUC_BUNDLE_SLOTS = "rootfs"
RAUC_SLOT_rootfs = "product-test1"
RAUC_SLOT_rootfs[fstype] = "ext4"

RAUC_KEY_FILE = "${THISDIR}/../../../files/rauc-certs/development-1.key.pem"
RAUC_CERT_FILE = "${THISDIR}/../../../files/rauc-certs/development-1.cert.pem"
