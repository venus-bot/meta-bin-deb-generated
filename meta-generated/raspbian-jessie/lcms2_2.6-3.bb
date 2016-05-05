PACKAGES = "liblcms2-2"
PROVIDES = "liblcms2-2"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/l/lcms2/liblcms2-2_2.6-3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_liblcms2-2 = "liblcms2-2_2.6-3_armhf.deb"
SRC_URI[deb0.sha256sum] = "30eb6de329e8710602a42d50c0a77b091aa1e99872c2f00781abfb9c6a0e5f78"
SRC_URI[deb0.md5sum] = "a3f991bd89cfad3d12485c96b8a85f6c"

RDEPENDS_lib${PN}-2 = "libc6 (>= 2.7)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_liblcms2-2 = " \
	./usr/share/doc/liblcms2-2/copyright \
	./usr/share/doc/liblcms2-2/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/liblcms2.so.2 \
	./usr/share/doc/liblcms2-2/changelog.gz \
	./usr/lib/arm-linux-gnueabihf/liblcms2.so.2.0.6\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
