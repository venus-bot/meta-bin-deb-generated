PACKAGES = "${PN} libxdmcp-dev libxdmcp6"
PROVIDES = "libxdmcp-dev libxdmcp6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libx/libxdmcp/libxdmcp-dev_1.1.1-1+deb8u1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/libx/libxdmcp/libxdmcp6_1.1.1-1+deb8u1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libxdmcp-dev = "libxdmcp-dev_1.1.1-1+deb8u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "8610985382bbeda0fef3c4b273d7837fcd6753bfa43d825fdb7e87a2a6810017"
SRC_URI[deb0.md5sum] = "cff008c328198f21f75dac24f6324ab6"
DEBFILENAME_libxdmcp6 = "libxdmcp6_1.1.1-1+deb8u1_armhf.deb"
SRC_URI[deb1.sha256sum] = "7f4048a687abcbc1a85f328f03ef20c61688abbdb241207acc809a4c5285d69e"
SRC_URI[deb1.md5sum] = "ad521e3d6dd6e60b82ce4613e8f370a5"

RDEPENDS_${PN}-dev = "libxdmcp6 (= 1:1.1.1-1+deb8u1) x11proto-core-dev"
RDEPENDS_${PN}6 = "libc6 (>= 2.4)"
DEPENDS = "libc6 x11proto-core-dev"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN}-dev = " \
    ./usr/include/X11/Xdmcp.h \
    ./usr/lib/arm-linux-gnueabihf/libXdmcp.a \
    ./usr/lib/arm-linux-gnueabihf/libXdmcp.so \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/xdmcp.pc \
    ./usr/share/doc/libxdmcp-dev/changelog.Debian.gz \
    ./usr/share/doc/libxdmcp-dev/changelog.gz \
    ./usr/share/doc/libxdmcp-dev/copyright \
    ./usr/share/doc/libxdmcp-dev/xdmcp.txt.gz\
"
FILES_libxdmcp6 = " \
    ./usr/lib/arm-linux-gnueabihf/libXdmcp.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libXdmcp.so.6.0.0 \
    ./usr/share/doc/libxdmcp6/changelog.Debian.gz \
    ./usr/share/doc/libxdmcp6/changelog.gz \
    ./usr/share/doc/libxdmcp6/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
