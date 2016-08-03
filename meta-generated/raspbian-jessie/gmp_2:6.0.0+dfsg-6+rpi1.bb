PACKAGES = "libgmp10"
PROVIDES = "libgmp10"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/g/gmp/libgmp10_6.0.0+dfsg-6+rpi1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libgmp10 = "libgmp10_6.0.0+dfsg-6+rpi1_armhf.deb"
SRC_URI[deb0.sha256sum] = "7f413d6329ed39f939fc7b5ad900051ca4b745ab2ad40dec554cc21402e520da"
SRC_URI[deb0.md5sum] = "eb980c6250a8e3458fd80410c5437b2c"

RDEPENDS_lib${PN}10 = "libc6 (>= 2.7)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libgmp10 = " \
	./usr/share/doc/libgmp10/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/libgmp.so.10 \
	./usr/lib/arm-linux-gnueabihf/libgmp.so.10.2.0 \
	./usr/share/doc/libgmp10/copyright \
	./usr/share/doc/libgmp10/README.Debian\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
