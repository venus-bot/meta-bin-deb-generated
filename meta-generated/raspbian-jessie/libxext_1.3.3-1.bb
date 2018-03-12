PACKAGES = "${PN} libxext6"
PROVIDES = "libxext6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libx/libxext/libxext6_1.3.3-1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libxext6 = "libxext6_1.3.3-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "51237fb9aaa2b6fdb92e23a935404856cd89081d7b123ef63c74831678fb3f5c"
SRC_URI[deb0.md5sum] = "7de76b9db4a7dee5a9f7873281ba7443"

RDEPENDS_${PN}6 = "libc6 (>= 2.4) libx11-6 (>= 2:1.6.0)"
DEPENDS = "libx11-6 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libxext6 = " \
    ./usr/lib/arm-linux-gnueabihf/libXext.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libXext.so.6.4.0 \
    ./usr/share/doc/libxext6/changelog.Debian.gz \
    ./usr/share/doc/libxext6/changelog.gz \
    ./usr/share/doc/libxext6/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
