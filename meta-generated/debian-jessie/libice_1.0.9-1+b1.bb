PACKAGES = "${PN} libice6"
PROVIDES = "libice6"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libi/libice/libice6_1.0.9-1+b1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libice6 = "libice6_1.0.9-1+b1_armhf.deb"
SRC_URI[deb0.sha256sum] = "c98b0b58ad6d262bfd5ccfa4703a194d509dce046d85709dc2b5149699613a76"
SRC_URI[deb0.md5sum] = "8a1206f9cb1ea7f86fdcc8cf00a326d8"

RDEPENDS_${PN}6 = "libc6 (>= 2.11) x11-common"
DEPENDS = "libc6 x11-common"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libice6 = " \
    ./usr/lib/arm-linux-gnueabihf/libICE.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libICE.so.6.3.0 \
    ./usr/share/doc/libice6/changelog.Debian.armhf.gz \
    ./usr/share/doc/libice6/changelog.Debian.gz \
    ./usr/share/doc/libice6/changelog.gz \
    ./usr/share/doc/libice6/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
