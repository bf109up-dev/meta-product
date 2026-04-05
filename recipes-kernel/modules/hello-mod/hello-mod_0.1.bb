SUMMARY = "Simple Hello World Kernel Module"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

inherit module

SRC_URI = "file://hello.c \
           file://Makefile"

S = "${WORKDIR}/sources"

# The module is named hello-mod to distinguish from the source filename if needed
# But standard Yocto module will look for $(FILE).o
do_compile:prepend() {
    cp ${WORKDIR}/hello.c ${S}/
    cp ${WORKDIR}/Makefile ${S}/
}
