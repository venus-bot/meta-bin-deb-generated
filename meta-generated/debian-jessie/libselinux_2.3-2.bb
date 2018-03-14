PACKAGES = "${PN} libselinux1"
PROVIDES = "libselinux1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libs/libselinux/libselinux1_2.3-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libselinux1 = "libselinux1_2.3-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "d01c86277c3929c700f0889632f839929f381d75a0a28e4223ac28cdb12535a3"
SRC_URI[deb0.md5sum] = "1e32c545a45bc364ad6dd8408f19b918"

RDEPENDS_${PN}1 = "libc6 (>= 2.8) libpcre3 (>= 8.10)"
DEPENDS = "libpcre3 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libselinux1 = " \
    ./lib/arm-linux-gnueabihf/libselinux.so.1 \
    ./usr/share/doc/libselinux1/changelog.Debian.gz \
    ./usr/share/doc/libselinux1/changelog.gz \
    ./usr/share/doc/libselinux1/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
