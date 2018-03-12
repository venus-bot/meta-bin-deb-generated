PACKAGES = "${PN} debianutils"
PROVIDES = "debianutils"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/d/debianutils/debianutils_4.4+b1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_debianutils = "debianutils_4.4+b1_armhf.deb"
SRC_URI[deb0.sha256sum] = "c59163d2115686458c3a378138abb8627af7c101dce55134ecb71f2f4e64b2fd"
SRC_URI[deb0.md5sum] = "975ef98ef884ed1b4ebfa6bc01279cfb"

RDEPENDS_${PN} = "sensible-utils"
DEPENDS = "sensible-utils"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
    ./usr/share/man/sl/man8/remove-shell.8.gz \
    ./usr/share/man/man8/run-parts.8.gz \
    ./usr/share/man/ja/man8/add-shell.8.gz \
    ./usr/share/debianutils/shells \
    ./usr/share/man/pl/man8/installkernel.8.gz \
    ./usr/share/man/it/man8/remove-shell.8.gz \
    ./usr/share/man/pl/man1/which.1.gz \
    ./usr/share/man/es/man1/tempfile.1.gz \
    ./usr/share/man/es/man8/savelog.8.gz \
    ./usr/share/man/de/man8/installkernel.8.gz \
    ./usr/share/man/pl/man8/remove-shell.8.gz \
    ./usr/share/man/fr/man1/tempfile.1.gz \
    ./usr/share/man/ja/man1/tempfile.1.gz \
    ./usr/share/man/sl/man8/installkernel.8.gz \
    ./usr/share/man/de/man8/savelog.8.gz \
    ./usr/share/man/fr/man8/run-parts.8.gz \
    ./usr/share/man/sl/man8/savelog.8.gz \
    ./usr/share/man/fr/man8/savelog.8.gz \
    ./usr/share/man/ja/man8/remove-shell.8.gz \
    ./usr/share/man/it/man8/add-shell.8.gz \
    ./bin/tempfile \
    ./usr/share/man/sl/man1/tempfile.1.gz \
    ./usr/share/man/pl/man8/add-shell.8.gz \
    ./usr/share/man/it/man8/savelog.8.gz \
    ./usr/share/man/de/man8/remove-shell.8.gz \
    ./usr/share/man/de/man8/add-shell.8.gz \
    ./usr/share/man/de/man1/tempfile.1.gz \
    ./usr/share/doc/debianutils/copyright \
    ./usr/share/man/es/man8/add-shell.8.gz \
    ./usr/share/man/pl/man8/savelog.8.gz \
    ./usr/share/man/pl/man1/tempfile.1.gz \
    ./usr/share/man/sl/man8/run-parts.8.gz \
    ./usr/share/man/es/man8/remove-shell.8.gz \
    ./usr/share/man/sl/man8/add-shell.8.gz \
    ./usr/share/doc/debianutils/README.shells.gz \
    ./usr/share/man/de/man8/run-parts.8.gz \
    ./usr/share/man/ja/man8/installkernel.8.gz \
    ./usr/share/man/man8/remove-shell.8.gz \
    ./usr/share/man/es/man8/run-parts.8.gz \
    ./usr/share/man/it/man8/run-parts.8.gz \
    ./usr/share/man/fr/man8/installkernel.8.gz \
    ./usr/share/man/fr/man1/which.1.gz \
    ./usr/share/man/it/man1/tempfile.1.gz \
    ./usr/share/man/fr/man8/remove-shell.8.gz \
    ./usr/sbin/remove-shell \
    ./usr/bin/savelog \
    ./usr/share/man/man1/which.1.gz \
    ./usr/bin/which \
    ./usr/share/man/man1/ischroot.1.gz \
    ./bin/run-parts \
    ./usr/share/man/it/man1/which.1.gz \
    ./usr/share/man/pl/man8/run-parts.8.gz \
    ./usr/share/man/it/man8/installkernel.8.gz \
    ./usr/share/man/man1/tempfile.1.gz \
    ./usr/share/man/sl/man1/which.1.gz \
    ./usr/share/man/ja/man8/run-parts.8.gz \
    ./usr/share/man/fr/man8/add-shell.8.gz \
    ./usr/sbin/add-shell \
    ./bin/which \
    ./usr/share/man/ja/man8/savelog.8.gz \
    ./usr/bin/ischroot \
    ./usr/share/man/es/man1/which.1.gz \
    ./usr/share/man/man8/installkernel.8.gz \
    ./usr/share/man/man8/savelog.8.gz \
    ./usr/share/man/de/man1/which.1.gz \
    ./sbin/installkernel \
    ./usr/share/man/es/man8/installkernel.8.gz \
    ./usr/share/man/man8/add-shell.8.gz \
    ./usr/share/man/ja/man1/which.1.gz \
    ./usr/share/doc/debianutils/changelog.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
