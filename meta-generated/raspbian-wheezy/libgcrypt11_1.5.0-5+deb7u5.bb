PACKAGES = "libgcrypt11"
PROVIDES = "libgcrypt11"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libg/libgcrypt11/libgcrypt11_1.5.0-5+deb7u5_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libgcrypt11 = "libgcrypt11_1.5.0-5+deb7u5_armhf.deb"
SRC_URI[deb0.sha256sum] = "914c741af865cd74abfb821728fabb15ddb71f65bc30237c4c0817fd38c5d345"
SRC_URI[deb0.md5sum] = "35ea04ff5c9cc8cc084a35baabc67dca"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libgpg-error0 (>= 1.10)"
DEPENDS = "libgpg-error0 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/share/doc/libgcrypt11/changelog.Debian.gz \
	./usr/share/doc/libgcrypt11/TODO \
	./usr/share/doc/libgcrypt11/AUTHORS.gz \
	./usr/share/doc/libgcrypt11/changelog.gz \
	./lib/arm-linux-gnueabihf/libgcrypt.so.11 \
	./usr/share/doc/libgcrypt11/THANKS.gz \
	./usr/share/doc/libgcrypt11/NEWS.gz \
	./usr/share/doc/libgcrypt11/README.gz \
	./lib/arm-linux-gnueabihf/libgcrypt.so.11.7.0 \
	./usr/share/doc/libgcrypt11/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
