PACKAGES = "libgcrypt11"
PROVIDES = "libgcrypt11"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libg/libgcrypt11/libgcrypt11_1.5.0-5+deb7u6_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libgcrypt11 = "libgcrypt11_1.5.0-5+deb7u6_armhf.deb"
SRC_URI[deb0.sha256sum] = "a2bbe59ed549f9abc697dde53e1581428185b5781360267b3b384b5f938e160e"
SRC_URI[deb0.md5sum] = "17b0b6fed3a111c29cfeb9b4ce5e8165"

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
