PACKAGES = "libffi6"
PROVIDES = "libffi6"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libf/libffi/libffi6_3.1-2+deb8u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libffi6 = "libffi6_3.1-2+deb8u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "3225bb209c515470e174916594fbfc3213f3633af50410c09cc481b323203640"
SRC_URI[deb0.md5sum] = "13541aaa0441c3b6ac16a7fb83b949c2"

RDEPENDS_${PN}6 = "libc6 (>= 2.4) libgcc1 (>= 1:4.4.0)"
DEPENDS = "libgcc1 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libffi6 = " \
	./usr/lib/arm-linux-gnueabihf/libffi.so.6 \
	./usr/share/doc/libffi6/changelog.Debian.gz \
	./usr/share/doc/libffi6/copyright \
	./usr/lib/arm-linux-gnueabihf/libffi.so.6.0.2\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
