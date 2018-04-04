PACKAGES = "${PN} libexpat1"
PROVIDES = "libexpat1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/e/expat/libexpat1_2.1.0-6+deb8u4_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libexpat1 = "libexpat1_2.1.0-6+deb8u4_armhf.deb"
SRC_URI[deb0.sha256sum] = "5444982b2a0e2d091e1918de2fdded3ddaad79e766fc3c984c3ad61341696b89"
SRC_URI[deb0.md5sum] = "908e3ad199f6668e143d0bcd60dff879"

RDEPENDS_lib${PN}1 = "libc6 (>= 2.4) libgcc1 (>= 1:4.4.0)"
DEPENDS = "libc6 libgcc1"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libexpat1 = " \
    ./lib/arm-linux-gnueabihf/libexpat.so.1 \
    ./lib/arm-linux-gnueabihf/libexpat.so.1.6.0 \
    ./usr/lib/arm-linux-gnueabihf/libexpatw.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libexpatw.so.1.6.0 \
    ./usr/share/doc/libexpat1/changelog.Debian.gz \
    ./usr/share/doc/libexpat1/changelog.gz \
    ./usr/share/doc/libexpat1/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
