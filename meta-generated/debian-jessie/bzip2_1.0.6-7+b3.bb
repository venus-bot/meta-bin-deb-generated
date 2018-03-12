PACKAGES = "${PN} libbz2-1.0"
PROVIDES = "libbz2-1.0"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/b/bzip2/libbz2-1.0_1.0.6-7+b3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libbz2-1.0 = "libbz2-1.0_1.0.6-7+b3_armhf.deb"
SRC_URI[deb0.sha256sum] = "c56314c9e4eca39d211911416111cda3e0ba455a03908ee546d1aba177550d00"
SRC_URI[deb0.md5sum] = "ecc2bd9b4e3dcabde58ff601347eee29"

RDEPENDS_libbz2-1.0 = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libbz2-1.0 = " \
    ./lib/arm-linux-gnueabihf/libbz2.so.1 \
    ./lib/arm-linux-gnueabihf/libbz2.so.1.0 \
    ./lib/arm-linux-gnueabihf/libbz2.so.1.0.4 \
    ./usr/share/doc/libbz2-1.0/copyright \
    ./usr/share/doc/libbz2-1.0/changelog.Debian.armhf.gz \
    ./usr/share/doc/libbz2-1.0/changelog.gz \
    ./usr/share/doc/libbz2-1.0/changelog.Debian.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
