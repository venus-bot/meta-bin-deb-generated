PACKAGES = "libxrender1"
PROVIDES = "libxrender1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libx/libxrender/libxrender1_0.9.7-1+deb7u3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libxrender1 = "libxrender1_0.9.7-1+deb7u3_armhf.deb"
SRC_URI[deb0.sha256sum] = "fb19587c3aa0be41e06acf8e7daeda91b3e0f770be33d35d290da61ef1ccb724"
SRC_URI[deb0.md5sum] = "0c7829c48a3fef2d97dd32dc336437ec"

RDEPENDS_${PN}1 = "libc6 (>= 2.13-28) libx11-6 (>= 2:1.4.99.1)"
DEPENDS = "libx11-6 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libxrender1 = " \
	./usr/share/doc/libxrender1/copyright \
	./usr/lib/arm-linux-gnueabihf/libXrender.so.1 \
	./usr/share/doc/libxrender1/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/libXrender.so.1.3.0 \
	./usr/share/doc/libxrender1/changelog.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
