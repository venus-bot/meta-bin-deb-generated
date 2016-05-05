PACKAGES = "zlib1g"
PROVIDES = "zlib1g"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/z/zlib/zlib1g_1.2.8.dfsg-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_zlib1g = "zlib1g_1.2.8.dfsg-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "6ccc881c8a3d9841239466145113570618a03cb63e1f547b76dacac5e4fa2bd9"
SRC_URI[deb0.md5sum] = "03beeedc8aa430fbd746959126ef7d9a"

RDEPENDS_${PN}1g = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_zlib1g = " \
	./lib/arm-linux-gnueabihf/libz.so.1.2.8 \
	./usr/share/doc/zlib1g/copyright \
	./usr/share/doc/zlib1g/changelog.Debian.gz \
	./lib/arm-linux-gnueabihf/libz.so.1 \
	./usr/share/doc/zlib1g/changelog.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
