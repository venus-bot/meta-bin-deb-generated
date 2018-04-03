PACKAGES = "${PN} libxt6"
PROVIDES = "libxt6"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libx/libxt/libxt6_1.1.4-1+b1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libxt6 = "libxt6_1.1.4-1+b1_armhf.deb"
SRC_URI[deb0.sha256sum] = "40abdb4e94de643075f46b09ab62e6b14d39fb17af1db9dbbad2c26a9e8bc325"
SRC_URI[deb0.md5sum] = "8f04c396ad766afad90d06efe22c9dea"

RDEPENDS_${PN}6 = "libc6 (>= 2.7) libice6 (>= 1:1.0.0) libsm6 libx11-6"
DEPENDS = "libsm6 libice6 libx11-6 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libxt6 = " \
    ./usr/lib/arm-linux-gnueabihf/libXt.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libXt.so.6.0.0 \
    ./usr/share/doc/libxt6/changelog.Debian.armhf.gz \
    ./usr/share/doc/libxt6/changelog.Debian.gz \
    ./usr/share/doc/libxt6/changelog.gz \
    ./usr/share/doc/libxt6/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
