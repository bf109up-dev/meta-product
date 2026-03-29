require recipes-core/images/core-image-base.bb

SUMMARY = "Custom image for product-test1, based on core-image-base with network tools"

# Network diagnostic tools
IMAGE_INSTALL += "ethtool"
IMAGE_INSTALL += "mii-tools"
IMAGE_INSTALL += "net-tools"
IMAGE_INSTALL += "iperf3"
IMAGE_INSTALL += "tcpdump"

# A/B OTA Update Framework (RAUC)
IMAGE_INSTALL += "rauc"
IMAGE_INSTALL += "rauc-conf"
