PACKAGES = "${PN} debianutils"
PROVIDES = "debianutils"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/d/debianutils/debianutils_4.8.6.1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_debianutils = "debianutils_4.8.6.1_armhf.deb"
SRC_URI[deb0.sha256sum] = "8ac0f6d8a91a435c977f93b7b043910e20e7505ff186dc569b4f8a5a37fafd60"
SRC_URI[deb0.md5sum] = "a165e4c67ed97c992bff4f967ec89a26"

RDEPENDS_${PN} = "libc6 (>= 2.15)"
DEPENDS = "libc6"


inherit deb_group

FILES_${PN} = " \
    ./bin/run-parts \
    ./bin/tempfile \
    ./bin/which \
    ./sbin/installkernel \
    ./usr/bin/ischroot \
    ./usr/bin/savelog \
    ./usr/sbin/add-shell \
    ./usr/sbin/remove-shell \
    ./usr/share/debianutils/shells \
    ./usr/share/doc/debianutils/README.shells.gz \
    ./usr/share/doc/debianutils/changelog.gz \
    ./usr/share/doc/debianutils/copyright \
    ./usr/share/man/de/man1/tempfile.1.gz \
    ./usr/share/man/de/man1/which.1.gz \
    ./usr/share/man/de/man8/add-shell.8.gz \
    ./usr/share/man/de/man8/installkernel.8.gz \
    ./usr/share/man/de/man8/remove-shell.8.gz \
    ./usr/share/man/de/man8/run-parts.8.gz \
    ./usr/share/man/de/man8/savelog.8.gz \
    ./usr/share/man/es/man1/tempfile.1.gz \
    ./usr/share/man/es/man1/which.1.gz \
    ./usr/share/man/es/man8/add-shell.8.gz \
    ./usr/share/man/es/man8/installkernel.8.gz \
    ./usr/share/man/es/man8/remove-shell.8.gz \
    ./usr/share/man/es/man8/run-parts.8.gz \
    ./usr/share/man/es/man8/savelog.8.gz \
    ./usr/share/man/fr/man1/tempfile.1.gz \
    ./usr/share/man/fr/man1/which.1.gz \
    ./usr/share/man/fr/man8/add-shell.8.gz \
    ./usr/share/man/fr/man8/installkernel.8.gz \
    ./usr/share/man/fr/man8/remove-shell.8.gz \
    ./usr/share/man/fr/man8/run-parts.8.gz \
    ./usr/share/man/fr/man8/savelog.8.gz \
    ./usr/share/man/it/man1/tempfile.1.gz \
    ./usr/share/man/it/man1/which.1.gz \
    ./usr/share/man/it/man8/add-shell.8.gz \
    ./usr/share/man/it/man8/installkernel.8.gz \
    ./usr/share/man/it/man8/remove-shell.8.gz \
    ./usr/share/man/it/man8/run-parts.8.gz \
    ./usr/share/man/it/man8/savelog.8.gz \
    ./usr/share/man/ja/man1/tempfile.1.gz \
    ./usr/share/man/ja/man1/which.1.gz \
    ./usr/share/man/ja/man8/add-shell.8.gz \
    ./usr/share/man/ja/man8/installkernel.8.gz \
    ./usr/share/man/ja/man8/remove-shell.8.gz \
    ./usr/share/man/ja/man8/run-parts.8.gz \
    ./usr/share/man/ja/man8/savelog.8.gz \
    ./usr/share/man/man1/ischroot.1.gz \
    ./usr/share/man/man1/tempfile.1.gz \
    ./usr/share/man/man1/which.1.gz \
    ./usr/share/man/man8/add-shell.8.gz \
    ./usr/share/man/man8/installkernel.8.gz \
    ./usr/share/man/man8/remove-shell.8.gz \
    ./usr/share/man/man8/run-parts.8.gz \
    ./usr/share/man/man8/savelog.8.gz \
    ./usr/share/man/pl/man1/tempfile.1.gz \
    ./usr/share/man/pl/man1/which.1.gz \
    ./usr/share/man/pl/man8/add-shell.8.gz \
    ./usr/share/man/pl/man8/installkernel.8.gz \
    ./usr/share/man/pl/man8/remove-shell.8.gz \
    ./usr/share/man/pl/man8/run-parts.8.gz \
    ./usr/share/man/pl/man8/savelog.8.gz \
    ./usr/share/man/sl/man1/tempfile.1.gz \
    ./usr/share/man/sl/man1/which.1.gz \
    ./usr/share/man/sl/man8/add-shell.8.gz \
    ./usr/share/man/sl/man8/installkernel.8.gz \
    ./usr/share/man/sl/man8/remove-shell.8.gz \
    ./usr/share/man/sl/man8/run-parts.8.gz \
    ./usr/share/man/sl/man8/savelog.8.gz\
"
