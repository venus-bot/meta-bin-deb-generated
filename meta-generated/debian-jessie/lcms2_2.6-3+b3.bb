PACKAGES = "liblcms2-2"
PROVIDES = "liblcms2-2"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/l/lcms2/liblcms2-2_2.6-3+b3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_liblcms2-2 = "liblcms2-2_2.6-3+b3_armhf.deb"
SRC_URI[deb0.sha256sum] = "dbfc7b32f95fc30107df3e0f776ecf8248e0915ac7cab76c6f8ac48c3d0dced5"
SRC_URI[deb0.md5sum] = "caa67beb2c50ae5df96dd1eee5b8a4a5"

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
	./usr/lib/arm-linux-gnueabihf/liblcms2.so.2.0.6 \
	./usr/share/doc/liblcms2-2/changelog.gz \
	./usr/share/doc/liblcms2-2/changelog.Debian.armhf.gz \
	./usr/lib/arm-linux-gnueabihf/liblcms2.so.2\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
