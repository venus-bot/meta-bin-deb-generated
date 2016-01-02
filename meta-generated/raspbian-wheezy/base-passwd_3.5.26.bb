PACKAGES = "base-passwd"
PROVIDES = "base-passwd"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/b/base-passwd/base-passwd_3.5.26_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_base-passwd = "base-passwd_3.5.26_armhf.deb"
SRC_URI[deb0.sha256sum] = "e66cecdc85494cfe0657a525bd87f594d0f25a6d7139860859192842566228eb"
SRC_URI[deb0.md5sum] = "18e0c5eef755210e2196ddfbac945e56"

RDEPENDS_${PN} = "libc6 (>= 2.13-28)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/share/base-passwd/passwd.master \
	./usr/share/base-passwd/group.master \
	./usr/share/man/de/man8/update-passwd.8.gz \
	./usr/share/man/es/man8/update-passwd.8.gz \
	./usr/share/doc/base-passwd/copyright \
	./usr/share/doc-base/users-and-groups \
	./usr/share/man/fr/man8/update-passwd.8.gz \
	./usr/share/doc/base-passwd/users-and-groups.html \
	./usr/share/doc/base-passwd/README \
	./usr/share/man/ru/man8/update-passwd.8.gz \
	./usr/share/doc/base-passwd/users-and-groups.txt.gz \
	./usr/share/man/man8/update-passwd.8.gz \
	./usr/sbin/update-passwd \
	./usr/share/man/pl/man8/update-passwd.8.gz \
	./usr/share/doc/base-passwd/changelog.gz \
	./usr/share/man/ja/man8/update-passwd.8.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
