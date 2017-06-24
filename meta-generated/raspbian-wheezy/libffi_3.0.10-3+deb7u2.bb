PACKAGES = "libffi5"
PROVIDES = "libffi5"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libf/libffi/libffi5_3.0.10-3+deb7u2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libffi5 = "libffi5_3.0.10-3+deb7u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "6595390b453f7e07c47baa01509e7f87c06565c004f099455adb74ea46657f16"
SRC_URI[deb0.md5sum] = "878e11388eebc18f3ab15534bfb091a6"

RDEPENDS_${PN}5 = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0)"
DEPENDS = "libgcc1 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libffi5 = " \
	./usr/lib/arm-linux-gnueabihf/libffi.so.5.0.10 \
	./usr/share/doc/libffi5/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/libffi.so.5 \
	./usr/share/doc/libffi5/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
