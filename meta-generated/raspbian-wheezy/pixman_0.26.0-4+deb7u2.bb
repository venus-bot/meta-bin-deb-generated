PACKAGES = "libpixman-1-0"
PROVIDES = "libpixman-1-0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/p/pixman/libpixman-1-0_0.26.0-4+deb7u2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libpixman-1-0 = "libpixman-1-0_0.26.0-4+deb7u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "7555bba92031383340ac917eb44e9cd7346cd67b45fbaeec8b8b4c5c8baebf38"
SRC_URI[deb0.md5sum] = "0607d8259de639207c11276b69ac739c"

RDEPENDS_lib${PN}-1-0 = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0)"
DEPENDS = "libgcc1 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libpixman-1-0 = " \
	./usr/lib/arm-linux-gnueabihf/libpixman-1.so.0 \
	./usr/share/doc/libpixman-1-0/changelog.gz \
	./usr/lib/arm-linux-gnueabihf/libpixman-1.so.0.26.0 \
	./usr/share/doc/libpixman-1-0/changelog.Debian.gz \
	./usr/share/doc/libpixman-1-0/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
